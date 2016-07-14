/*
 * Copyright 2016 mljr.com All right reserved. This software is the
 * confidential and proprietary information of mljr.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with mljr.com .
 */
package indi.solomon.pattern.bridge.clothing;

/**
 * Created by dalei.liu on 2016/7/14.
 */
public class Woman extends Person {

    public Woman()
    {
        setType("女人");
    }

    @Override
    public void dress() {
        getClothing().dressCloth(this);
    }

}