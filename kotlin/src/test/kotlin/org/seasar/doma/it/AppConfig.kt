package org.seasar.doma.it

import org.seasar.doma.jdbc.Config
import org.seasar.doma.jdbc.Naming
import org.seasar.doma.jdbc.RequiresNewController
import org.seasar.doma.jdbc.SimpleDataSource
import org.seasar.doma.jdbc.dialect.Dialect
import org.seasar.doma.jdbc.tx.LocalTransaction
import org.seasar.doma.jdbc.tx.LocalTransactionDataSource
import org.seasar.doma.jdbc.tx.LocalTransactionManager
import org.seasar.doma.jdbc.tx.TransactionManager
import java.util.function.Supplier
import javax.sql.DataSource

class AppConfig(private val dialect: Dialect, private val dbms: Dbms, url: String, user: String, password: String) : Config {
    private val originalDataSource: DataSource = createDataSource(url, user, password)
    private val dataSource: LocalTransactionDataSource = LocalTransactionDataSource(originalDataSource)
    private val transactionManager: LocalTransactionManager = LocalTransactionManager(dataSource.getLocalTransaction(jdbcLogger))

    private fun createDataSource(url: String, user: String, password: String): DataSource {
        val dataSource = SimpleDataSource()
        dataSource.url = url
        dataSource.user = user
        dataSource.password = password
        return dataSource
    }

    override fun getDataSource(): DataSource {
        return dataSource
    }

    override fun getDialect(): Dialect {
        return dialect
    }

    override fun getDataSourceName(): String {
        return dbms.name
    }

    override fun getRequiresNewController(): RequiresNewController {
        return object : RequiresNewController {
            @Throws(Throwable::class)
            override fun <R> requiresNew(callback: RequiresNewController.Callback<R>): R {
                return transactionManager.requiresNew(
                    Supplier { callback.execute() }
                )
            }
        }
    }

    override fun getTransactionManager(): TransactionManager {
        return transactionManager
    }

    val localTransaction: LocalTransaction
        get() = dataSource.getLocalTransaction(jdbcLogger)

    override fun getNaming(): Naming {
        return Naming.SNAKE_UPPER_CASE
    }
}
