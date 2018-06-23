package org.grails.guides

class DataSource {

    public enum ConnectionType {
        DATABASE, DIRECTORY;
    }

    String name
    String description
    String connection
    String user
    String password
    ConnectionType connectionType

    static constraints = {
        name maxSize: 255
        description nullable: true
        user nullable: true
        password nullable: true
    }
}
