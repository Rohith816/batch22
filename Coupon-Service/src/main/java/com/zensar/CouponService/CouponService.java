package com.zensar.CouponService;

import java.util.List;

import com.zensar.entity.Coupon;
import com.zensar.entity.CouponDto;



public interface CouponService {

	List<CouponDto> getAllCoupon();

	CouponDto createCoupon(CouponDto coupon, String token);

	CouponDto updateStock(Integer couponId, CouponDto coupon);

	String deleteAllCoupon();

	String deleteCouponPara(Integer id);


	CouponDto findBycouponCode(String couponCode);

	

}