package org.codestatus.hadoop.wordcount.mapreduce;

import java.io.IOException;
import java.util.StringTokenizer;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class WordCountMap extends Mapper<LongWritable, Text, Text, IntWritable> {

	protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {

		String strValue = value.toString();

		StringTokenizer strTok = new StringTokenizer(strValue, " ");

		Text newKey = new Text();
		IntWritable newVal = new IntWritable(1);

		while (strTok.hasMoreTokens()) {

			newKey.set(strTok.nextToken());
			context.write(newKey, newVal);

		}

	}
}
