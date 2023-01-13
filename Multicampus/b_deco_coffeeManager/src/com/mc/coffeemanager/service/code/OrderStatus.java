package com.mc.coffeemanager.service.code;

//enum(enumerated type) : 열거형이라고함
//서로 연관된 상수들의 집합
//서로 연관된 상수들을 편하게 다루기 위한 enum만의 문법과 메서드가 제공된다.
public enum OrderStatus {
	/**
	 * 주문 상태 코드
	 * 
	 * @author 권용구
	 */

//	OK(0, "주문 생성 성공"); ==	public static final OrderStatus OK = new OrderStatus(0, "주문 생성 성공"); 두 코드는 동일함
	/** 주문 생성 성공 */
	OK(0, "주문 생성 성공"),
	/** 품절로 인한 주문 실패 */
	FAIL_CAUSE_SOULDOUT(1, "품절로 인한 주문 실패"),
	/** 재고 부족으로 인한 주문 실패 */
	FAIL_CAUSE_STOCK(2, "재고 부족으로 인한 주문 실패"),
	/** 시즌상품은 시즌 기간에만 구매가 가능합니다. */
	FAIL_CAUSE_SEASON(3, "시즌상품은 시즌 기간에만 구매가 가능합니다."),
	/** 주문 완료 */
	COMPLITE(4, "주문 완료");

	/** 주문 상태코드 */
	private int code;// 상태에 대한 설명으로 구성된 클래스

	/** 주문 상태 상세 */
	private String desc;

	private OrderStatus(int code, String desc) {
		this.code = code;
		this.desc = desc;
	}

	/** 주문 상태가 OK */
	public boolean isOk() {
		return code == OK.code;
	}
	
	/** 주문 상태가 Compleit */
	public boolean isCompleit() {
		return code == COMPLITE.code;

	}
	
	/** 주문 상태가 FAIL_CAUSE_SOULDOUT, FAIL_CAUSE_STOCK, FAIL_CAUSE_SEASON*/
	public boolean isFail() {
		if (code == FAIL_CAUSE_SOULDOUT.code || code == FAIL_CAUSE_STOCK.code || code == FAIL_CAUSE_SEASON.code) {
			return true;
		}
		return false;
	}

	public String desc() {
		return desc;

	}
}
