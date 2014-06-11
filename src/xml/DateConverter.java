package xml;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;

public class DateConverter implements Converter {

	//判断要转换的类型
	@Override
	public boolean canConvert(Class type) {
		return Date.class.isAssignableFrom(type);
	}

	//对象到xml的转换
	@Override
	public void marshal(Object source, HierarchicalStreamWriter writer,
			MarshallingContext context) {
		SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
		writer.setValue(format.format(source));
	}

	//xml到对象转换
	@Override
	public Object unmarshal(HierarchicalStreamReader reader,
			UnmarshallingContext context) {
		SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
		Date date=new Date();
		try {
			date = format.parse(reader.getValue());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}

}
