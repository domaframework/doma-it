package org.seasar.doma.it.kotlin.criteria

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.seasar.doma.it.kotlin.IntegrationTestEnvironment
import org.seasar.doma.jdbc.Config
import org.seasar.doma.jdbc.criteria.KEntityql
import org.seasar.doma.jdbc.criteria.KNativeSql

@ExtendWith(IntegrationTestEnvironment::class)
class DifferenceBetweenTwoDsls(config: Config) {
    private val entityql = KEntityql(config)
    private val nativeSql = KNativeSql(config)

    @Test
    fun compare() {
        val d = Department_()
        val e = Employee_()

        // (1) Use Entityql DSL
        val list1: List<Department> = entityql.from(d).innerJoin(e) {
            eq(d.departmentId, e.departmentId)
        }.fetch()

        // (2) Use NativeSql DSL
        val list2: List<Department> = nativeSql.from(d).innerJoin(e) {
            eq(d.departmentId, e.departmentId)
        }.fetch()

        println(list1.size) //  3
        println(list2.size) // 14
    }
}
