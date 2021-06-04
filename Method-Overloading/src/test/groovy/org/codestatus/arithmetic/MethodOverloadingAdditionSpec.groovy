package org.codestatus.arithmetic

import spock.lang.Specification

class MethodOverloadingAdditionSpec extends Specification{


    def MethodOverloadingAddition = new MethodOverloadingAddition()

    def 'addIntegerTest_01' (){

        expect:

        MethodOverloadingAddition.addNumbers(20, 05) == 25
    }

    def 'addIntegerTest_02' (){

        expect:

        !(MethodOverloadingAddition.addNumbers(20, 05) == 30)
    }

    def 'addIntegerTest_03' (){

        expect:

        MethodOverloadingAddition.addNumbers(45, 05) != 60
    }

    def 'addDoubleTest_01' (){

        expect:

        MethodOverloadingAddition.addNumbers(45.7, 34.8) == 80.5
    }

    def 'TypeCastTest'() {
        // typecast : int --> double
        expect:

        MethodOverloadingAddition.addNumbers(34, 50.5) == 84.5
    }

    def 'addNumbersTest_01'(){

        expect:

        MethodOverloadingAddition.addNumbers(num1, num2) == result

        where:

        num1   << [20, 45.90, 99]
        num2   << [45, 35.75, 45.99]
        result << [65, 81.65, 144.99]
    }

}
