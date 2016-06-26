package com.softeam.employees.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by elkouhen on 26/06/16.
 */
@RestController
@RequestMapping("/ping")
public class PingResource {

	@RequestMapping(method = RequestMethod.GET)
	public String ping() throws UnknownHostException {

		return InetAddress.getLocalHost().getHostAddress();
	}
}
