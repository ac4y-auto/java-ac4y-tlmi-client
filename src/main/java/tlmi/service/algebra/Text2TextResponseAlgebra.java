package tlmi.service.algebra;

import ac4y.base.domain.Ac4y;
import ac4y.service.domain.Ac4yServiceResponse;

public class Text2TextResponseAlgebra extends Ac4yServiceResponse {

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    private String object;

}
