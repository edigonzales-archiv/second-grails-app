package org.grails.guides

class BootStrap {

    def init = { servletContext ->

        def dataSource01 = new DataSource(name: 'GeoDB', description: 'Unsere GeoDB', connection: 'jdbc:postgresql://192.168.50.6:5432/pub', user: 'ddluser', password: 'ddluser', connectionType: 'DATABASE').save(failOnError:true)
        def dataSet01 = new DataSet(name: 'ch.so.alw.bienenstandorte_und_sperrgebiete.bienenstandorte', description: 'Standorte von Bienenkolonien', dataSetName: 'alw_gelan_pub.bienenstandorte', dataSource: dataSource01).save(failOnError:true)

    }
    def destroy = {
    }
}
