package tags;

import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;

public class Span extends TagSupport{
    private String bgColor;
    private String color;

    public void setBgColor (String bg){
        this.bgColor = bg;
    }

    public void setColor (String c){
        this.color=c;
    }

    public int doStartTag() throws JspException{
        JspWriter out = pageContext.getOut();
        try{
            out.println("<span style=\"background:" + bgColor +";color:"+color+"\">");
        } catch (IOException e){}
        
        return EVAL_BODY_INCLUDE;
    }

    public int doEndTag()throws JspException{
        JspWriter out = pageContext.getOut();
        try{out.println("</span>");} catch (IOException e){}

        return EVAL_PAGE;
    }
}