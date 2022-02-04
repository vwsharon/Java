package org.codestatus.hadoop.wordcount.mapreduce

import spock.lang.Specification

class WordCountSpec extends Specification {

    def objWordCount = new WordCount()

    def 'word-count-test-0001'(){

        when:
            String [] args = ["E:\\Development\\Github_vwsharon\\Java\\Hadoop-MapReduce\\src\\test\\resources\\input",
                              "E:\\Development\\Github_vwsharon\\Java\\Hadoop-MapReduce\\src\\test\\resources\\output"]
        then:
            objWordCount.run(args) == 1
    }
}
