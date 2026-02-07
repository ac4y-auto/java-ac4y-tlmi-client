package tlmi.service.algebra;

import ac4y.base.domain.Ac4y;

public class Text2TextRequestAlgebra extends Ac4y {

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    private String text;
    private String target;
    private String source;

}
