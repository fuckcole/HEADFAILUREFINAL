package com.example.app

import org.scalatra._

class headfailureserver extends ScalatraServlet {

  get("/") {
    <h1>follow me to the 8th dimension</h1>
  }

}
// cd into head-failure-server
//sbt
//jetty:start
// ~;jetty:stop;jetty:start // to reboot the server
