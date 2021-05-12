/*
 * Copyright © 2020 https://github.com/openapi-processor/openapi-processor-core
 * PDX-License-Identifier: Apache-2.0
 */

package io.openapiprocessor.core.model.datatypes

class NoDataType(
    private val name: String,
    override val constraints: DataTypeConstraints? = null,
    override val deprecated: Boolean = false
): DataType {

    override fun getName(): String {
        return name
    }

    override fun getPackageName(): String {
        return "io.openapiprocessor.leaked"
    }

    override fun getImports(): Set<String> {
        return setOf("${getPackageName()}.${getName()}")
    }

}


