package com.gmail.fedorenko.kostia;

import java.io.IOException;
import javax.servlet.http.*;


@SuppressWarnings("serial")
public class InputServlet extends HttpServlet {
	private ApplicantArray list = ApplicantArray.getInstance();

	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		final String name = req.getParameter("name");
		final String surname = req.getParameter("surname");
		final String genderStr = req.getParameter("gender");
		final String citizenshipStr = req.getParameter("citizenship");
		
		final Integer gender = Integer.parseInt(genderStr);
		final Integer citizenship = Integer.parseInt(citizenshipStr);
		
		final Applicant appnew = new Applicant(name,surname,gender,citizenship);
		list.add(appnew);
		
		resp.sendRedirect("/form.jsp");;
		
	}
}
