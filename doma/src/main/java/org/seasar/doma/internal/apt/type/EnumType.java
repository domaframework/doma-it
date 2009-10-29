/*
 * Copyright 2004-2009 the Seasar Foundation and the Others.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package org.seasar.doma.internal.apt.type;

import static org.seasar.doma.internal.util.AssertionUtil.*;

import javax.annotation.processing.ProcessingEnvironment;
import javax.lang.model.type.TypeMirror;

/**
 * @author taedium
 * 
 */
public class EnumType extends BasicType {

    public EnumType(TypeMirror type, ProcessingEnvironment env) {
        super(type, env);
    }

    public static EnumType newInstance(TypeMirror type,
            ProcessingEnvironment env) {
        assertNotNull(type, env);
        EnumWrapperType wrapperType = EnumWrapperType.newInstance(type, env);
        if (wrapperType == null) {
            return null;
        }
        EnumType enumType = new EnumType(type, env);
        enumType.wrapperType = wrapperType;
        return enumType;
    }

    @Override
    public <R, P, TH extends Throwable> R accept(
            DataTypeVisitor<R, P, TH> visitor, P p) throws TH {
        return visitor.visitEnumType(this, p);
    }
}