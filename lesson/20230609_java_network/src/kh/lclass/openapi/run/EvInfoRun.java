package kh.lclass.openapi.run;

import kh.lclass.openapi.controller.EvinfoController;

public class EvInfoRun {

	public static void main(String[] args) {
		EvinfoController evInfoCtrl = new EvinfoController();
		evInfoCtrl.getEvIfoAll();
	}

}
