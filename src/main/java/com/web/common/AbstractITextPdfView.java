package com.web.common;

import org.springframework.web.servlet.view.AbstractView;

public abstract class AbstractITextPdfView extends AbstractView{
	public AbstractITextPdfView() {
        setContentType("application/pdf");
    }
	@Override
	protected boolean generatesDownloadContent() {
		return true;
	}
}
