package org.grails.guides

class DataSet {

    String name
    String description
    String dataSetName

    static belongsTo = [ dataSource: DataSource ]

    static constraints = {
        name maxSize: 255
        description nullable: true
    }
}
