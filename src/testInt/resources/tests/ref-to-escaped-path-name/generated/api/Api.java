/*
 * This class is auto generated by https://github.com/hauner/openapi-processor-core.
 * TEST ONLY.
 */

package generated.api;

import annotation.Mapping;
import annotation.Parameter;
import generated.model.Foo;

public interface Api {

    @Mapping("/foo")
    Foo getFoo();

    @Mapping("/foo/{id}")
    Foo getFooId(@Parameter Integer id);

}
