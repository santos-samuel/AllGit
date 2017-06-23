package org.zezutom.springseries0114.part05.service;

public class XmlPrinter extends Printer {

    @Override
    protected ObjectMapper getMapper() {
        return new XmlMapper();
    }
}
