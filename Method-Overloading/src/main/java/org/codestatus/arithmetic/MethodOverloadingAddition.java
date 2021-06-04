package org.codestatus.arithmetic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MethodOverloadingAddition {

    private static Logger logger = LoggerFactory.getLogger(MethodOverloadingAddition.class);

    public MethodOverloadingAddition(){
        logger.info("Constructor - MethodOverloadingAddition :: ");
    }

    public int addNumbers(int iNum1, int iNum2){

        logger.debug("Adding int variables :: {} & {}",iNum1, iNum2);

        return (iNum1 + iNum2);
    }

    public double addNumbers(double dNum1, double dNum2){

        logger.debug("Adding double variables :: {} & {} ", dNum1, dNum2);

        return (dNum1 + dNum2);
    }
}
