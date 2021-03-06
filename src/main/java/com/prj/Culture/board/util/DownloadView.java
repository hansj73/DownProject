package com.prj.Culture.board.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.servlet.view.AbstractView;


	
public class DownloadView  extends AbstractView{

	
    public DownloadView() {
        setContentType("applicaiton/download;charset=utf-8");
    }

	@Override

	protected void renderMergedOutputModel(Map<String, Object> model,HttpServletRequest request, HttpServletResponse response) throws Exception {

		    File file = (File) model.get("downloadFile");
		    
		    String realname=(String)model.get("realname");
		    
//		    System.out.println(":::::realname:::"+realname);


	        response.setContentType(getContentType());

	        response.setContentLength((int)file.length());

	         

	        String fileName = java.net.URLEncoder.encode(file.getName(), "UTF-8");
	               realname = java.net.URLEncoder.encode(realname, "UTF-8");

	         

	    /*    response.setHeader("Content-Disposition", "attachment;filename=\""+fileName+"\";");*/
	        response.setHeader("Content-Disposition", "attachment;filename=\""+realname+"\";");

	        response.setHeader("Content-Transfer-Encoding", "binary");

	         

	        OutputStream out = response.getOutputStream();

	        FileInputStream fis = null;

	         

	        try {

	            fis = new FileInputStream(file);

	            FileCopyUtils.copy(fis, out);

	        } catch (Exception e) {

	            e.printStackTrace();

	        } finally {

	            if (fis != null) { try { fis.close(); } catch (Exception e2) {}}

	        }

	        out.flush();
	}
		
}
