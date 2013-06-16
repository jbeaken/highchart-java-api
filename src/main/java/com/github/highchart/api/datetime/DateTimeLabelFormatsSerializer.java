package com.github.highchart.api.datetime;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.github.highchart.api.base.Serializer;
import com.github.highchart.api.datetime.DateTimeLabelFormats.TimeUnit;


public class DateTimeLabelFormatsSerializer extends Serializer<DateTimeLabelFormats> {

    @Override
    public Map<String, String> getProperties( DateTimeLabelFormats instance ) {
        Map<TimeUnit, String> map = instance.getFormats();
        Map<String, String> r = new HashMap<String, String>();
        for ( Entry<TimeUnit, String> e : map.entrySet() ) {
            r.put( e.getKey().name(), e.getValue() );
        }
        return r;
    }

}