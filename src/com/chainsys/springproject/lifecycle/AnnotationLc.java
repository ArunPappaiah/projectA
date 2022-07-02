package com.chainsys.springproject.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
// Not working from java9 higher versions
public class AnnotationLc {
	public AnnotationLc() {
		System.out.println("AnnotationLv Object created"+hashCode());
	}
	@PostConstruct
	public void start() {
		System.out.println("Start AnnotationLc...");
	}
	@PreDestroy
	public void stop() {
		System.out.println("Stopped AnnotationLc...");
	}
	public void print() {
		System.out.println("print AnnotationLc called");
	}
}
