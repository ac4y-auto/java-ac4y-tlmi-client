package tlmi.service.domain;

import tlmi.service.algebra.Text2TextRequestAlgebra;

public class Text2TextRequest extends Text2TextRequestAlgebra {


    public Text2TextRequest(String text, String target, String source){
        setTarget(target);
        setText(text);
        setSource(source);
    }

}
