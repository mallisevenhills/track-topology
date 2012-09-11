package com.track.response.status;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="status")
@XmlEnum
public enum Status {

	SUCCESS,
	FAILUE;
	
	public String getValue() {
		return name();
	}
	
	public static Status fromValue(String v) {
        return valueOf(v);
    }
}
