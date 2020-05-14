package com.example.jvmapp

import com.example.sqldelight.hockey.HockeyDb
import com.example.sqldelight.hockey.data.Db
import com.squareup.sqldelight.sqlite.driver.JdbcSqliteDriver

fun main() {
//    Class.forName("org.sqlite.JDBC")
    val driver = JdbcSqliteDriver("jdbc:sqlite:sample/jvmApp/build/com.example.sqldelight.hockey.sqlite")
    HockeyDb.Schema.create(driver)
    Db.dbSetup(driver)
    val db = Db.instance
    db.playerQueries.selectAll().executeAsList()
}