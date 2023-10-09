package com.erplogic.sap.apis;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.namespace.QName;

public final class JaxbToXml {
    private JaxbToXml() {

    }

    public static <T> void jaxbObjectToXML(final T o, final Class<T> clazz, final String pacakage) {
        try {

            final OutputStream os = new ByteArrayOutputStream();
            final JAXBContext jaxbContext = JAXBContext.newInstance(clazz);
            final Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            // To format XML
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            // If we DO NOT have JAXB annotated class
            final JAXBElement<T> jaxbElement = new JAXBElement<>(new QName("", pacakage), clazz, o);

            jaxbMarshaller.marshal(jaxbElement, os);

            System.out.println(new String(((ByteArrayOutputStream) os).toByteArray(), StandardCharsets.UTF_8));
            // If we have JAXB annotated class
            // jaxbMarshaller.marshal(employeeObj, System.out);

        } catch (final JAXBException e) {
            e.printStackTrace();
        }
    }
}
