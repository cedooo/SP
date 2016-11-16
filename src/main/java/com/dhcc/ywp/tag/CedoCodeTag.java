package com.dhcc.ywp.tag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

/**
 * Created by cedo on 2016/11/9.
 * 自定义标签-代码打印
 */
public class CedoCodeTag extends TagSupport{
    private String code = null;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public int doStartTag() throws JspException {
        try {

            JspWriter out = this.pageContext.getOut();

            if(code == null) {

                out.println("No code Found...");

                return SKIP_BODY;

            }

            out.println("<div width='100%' align='center' color='green'>");

            out.println(code);

            out.println("</div>");

        } catch(Exception e) {

            throw new JspException(e.getMessage());

        }

        return SKIP_BODY;
    }
    @Override

    public void release() {
        super.release();
        this.code = null;
    }

}
