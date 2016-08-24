package com.knight.estoque.exception;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.management.RuntimeErrorException;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.WebFault;

@WebFault(targetNamespace = "http://servicos.estoque.knight.com/excecoes/", name = "UsuarioNaoAutorizado")
public class UsuarioNaoAutorizadoException extends Exception {

	private static final long serialVersionUID = 1L;

	public UsuarioNaoAutorizadoException(String msg) {
		super(msg);
	}

	public UsuarioFaultInfo getFaultInfo() {
		return new UsuarioFaultInfo(getMessage());
	}

	@XmlAccessorType(XmlAccessType.FIELD)
	public static class UsuarioFaultInfo {
		@XmlAttribute
		private String mensagem;
		private XMLGregorianCalendar data;

		public UsuarioFaultInfo(String mensagem) {
			this.mensagem = mensagem;
			try {
				data = DatatypeFactory.newInstance().newXMLGregorianCalendar(new GregorianCalendar());
				data.setMillisecond(DatatypeConstants.FIELD_UNDEFINED);
				data.setTimezone(DatatypeConstants.FIELD_UNDEFINED);
			} catch (DatatypeConfigurationException e) {
				throw new RuntimeException(e);
			}
		}

		public UsuarioFaultInfo() {
		}
	}

}
