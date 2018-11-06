package com.siberiadante.designpattern.factory.abstractf;

import com.siberiadante.designpattern.factory.abstractf.colorf.ColorFactory;
import com.siberiadante.designpattern.factory.abstractf.shapef.ShapeFactory;

/**
 * create date: 2018/11/6
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String type) {
        if (type == null) {
            return null;
        }
        if (type.equalsIgnoreCase("SHAPE")) {
            return new ShapeFactory();
        }
        if (type.equalsIgnoreCase("COLOR")) {
            return new ColorFactory();
        }
        return null;
    }
}
