package com.track.router;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

public class DatabaseRouter extends AbstractRoutingDataSource{

	@Override
	protected Object determineCurrentLookupKey() {
		// TODO Auto-generated method stub
		return null;
	}

}
