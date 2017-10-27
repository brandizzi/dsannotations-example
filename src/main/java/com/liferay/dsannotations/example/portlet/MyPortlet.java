package com.liferay.dsannotations.example.portlet;

import java.util.Arrays;
import java.util.List;

import javax.portlet.Portlet;
import javax.servlet.ServletContext;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

/**
 * @author adam
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=My Portlet",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class MyPortlet extends MVCPortlet {
	
	@Reference(
		target = "(osgi.web.symbolicname=com.liferay.dsannotations.example)",
		unbind = "-"
	)
	protected void setServletContext(ServletContext servletContext) {
	}
}