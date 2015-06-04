package FirstProject.FilterWord;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class MyMapper extends Mapper<Text, IntWritable, Text, Text>{
@Override
protected void map(Text key, IntWritable value,
		Mapper<Text, IntWritable, Text, Text>.Context context)
		throws IOException, InterruptedException {
	// TODO Auto-generated method stub
	String line=value.toString();
	String[] arr=line.split(",");
	String id=arr[0];
	String location=arr[1];
	String name=arr[2];
	if(location.equals(location)){
		context.write(new Text(id.concat(name)), new Text(location));
	}
}
}
