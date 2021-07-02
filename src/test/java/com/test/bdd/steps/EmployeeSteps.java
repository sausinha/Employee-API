package com.test.bdd.steps;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.spring.CucumberContextConfiguration;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

@CucumberContextConfiguration
public class EmployeeSteps {

    private String apiServiceUrl = "http://localhost:" + 8089;

    private Scenario scenario;

    @Before
    public void before(Scenario scenario) {
        this.scenario = scenario;
    }

    @Given("^API Service is started$")
    public void api_service_is_started() throws IOException {

        int appPort = 8089;

        Socket socket = new Socket();
        socket.connect(new InetSocketAddress("localhost", appPort), 1000);
        socket.close();

    }

}
