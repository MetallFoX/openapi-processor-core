/*
 * This class is auto generated by https://github.com/hauner/openapi-processor-core.
 * TEST ONLY.
 */

package generated.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.validation.constraints.NotNull;

public class QueryGetResponse200 {

    @NotNull
    @JsonProperty("prop1")
    private String prop1;

    @JsonProperty("prop2")
    private String prop2;

    public String getProp1() {
        return prop1;
    }

    public void setProp1(String prop1) {
        this.prop1 = prop1;
    }

    public String getProp2() {
        return prop2;
    }

    public void setProp2(String prop2) {
        this.prop2 = prop2;
    }

}
