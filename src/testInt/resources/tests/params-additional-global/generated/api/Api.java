/*
 * This class is auto generated by https://github.com/hauner/openapi-processor-core.
 * TEST ONLY.
 */

package generated.api;

import annotation.Mapping;
import annotation.Parameter;
import javax.servlet.http.HttpServletRequest;

public interface Api {

    @Mapping("/foo")
    void getFoo(@Parameter String foo, @Parameter HttpServletRequest request);

}
