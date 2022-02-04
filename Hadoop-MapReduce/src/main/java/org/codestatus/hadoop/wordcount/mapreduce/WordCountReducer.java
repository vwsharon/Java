package org.codestatus.hadoop.wordcount.mapreduce;

import java.io.IOException;
import java.util.Iterator;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class WordCountReducer extends Reducer<Text, IntWritable, Text, IntWritable> {

	protected void reduce(Text key, Iterable<IntWritable> values, Context context)
			throws IOException, InterruptedException {

		int iSumValues = 0;
		Iterator<IntWritable> itrValues = values.iterator();

		while (itrValues.hasNext()) {

			iSumValues = iSumValues + itrValues.next().get();
		}

		context.write(key, new IntWritable(iSumValues));
	}
}
