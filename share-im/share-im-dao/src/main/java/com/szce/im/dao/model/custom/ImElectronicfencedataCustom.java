package com.szce.im.dao.model.custom;

import com.szce.im.dao.model.ImElectronicfenceclassification;
import com.szce.im.dao.model.ImElectronicfencedata;

import java.io.Serializable;

/**
 * 自定义 ImElectronicfencedata 类
 */
public class ImElectronicfencedataCustom extends ImElectronicfencedata implements Serializable {
    private ImElectronicfenceclassification imElectronicfenceclassification;

    public ImElectronicfenceclassification getImElectronicfenceclassification() {
        return imElectronicfenceclassification;
    }

    public void setImElectronicfenceclassification(ImElectronicfenceclassification imElectronicfenceclassification) {
        this.imElectronicfenceclassification = imElectronicfenceclassification;
    }
}