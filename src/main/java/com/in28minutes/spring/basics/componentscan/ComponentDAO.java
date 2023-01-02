package com.in28minutes.spring.basics.componentscan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
// @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class ComponentDAO {

    @Autowired
    ComponentJdbcConnection jdbcConnection;

    public ComponentJdbcConnection getComponentJdbcConnection() {
        return jdbcConnection;
    }

    public void setJdbcComponentConnection(ComponentJdbcConnection jdbcConnection) {
        this.jdbcConnection = jdbcConnection;
    }
}
