package org.dragonli.service.modules.user.interfaces;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public interface UserService {

	Map<String, Object> registUser(String username, String password) throws Exception;

	Map<String, Object> registUser(String username, String password, String recommendCode,
			Long countryId) throws Exception ;

	Map<String, Object> registUser(String username, String password, String recommendCode, Long countryId,
			String email, String phone, String nickname, String passwdCode,
			Map<String, Object> expendsParas) throws Exception;

	Map<String, Object> login(String username, String encryptedPasswd) throws Exception ;

	Map<String, Object> loginByCode(String username, String code) throws Exception;

	Map<String, Object> getUserById(Long id);

	List<Map<String, Object>> getUserList(List<Long> idList);

	Map<String, Object> findUser(Object key);
    Map<String,Object> findUserByKeyword(String key);

	Map<String, Object> resetPasswdById(Long id, String code) throws Exception ;

	Map<String, Object> resetPasswdByKey(String key, String code) throws Exception ;

	Map<String, Object> changePassword(Long id, String password, String newpw, String passwdCode,
			Boolean dontValicodeOld) throws Exception;


	Map<String, Object> changeEmail(Long id, String code, String newEmail, Boolean setEmailValidated) throws Exception;

	Map<String, Object> changePhone(Long id, String code, String newPhone, Boolean setPhoneValidated) throws Exception ;

	Map<String, Object> generateValidateCodeByUserId(Long id) throws Exception ;

	Map<String, Object> generateValidateCodeByUserId(String key) throws Exception;

	Map<String, Object> generateEmailCodeById(Long uid,String newEmail) throws Exception;
	Map<String, Object> generatePhoneCodeById(Long uid,String phone) throws Exception;

	Map<String, Object> generateLoginCode(String key);

	List<Map<String,Object>> allCountries();

	Map<String,Object> findCountryById(Long id);

	Map<String, Object> authValidateAndRefresh(Map<String, Object> authDto,Boolean refreshTime,Boolean autoGenerate);

	Map<String, Object> authValidateAndRefresh(Map<String, Object> authDto,Boolean refreshTime,Boolean autoGenerate, String privateKey,Long timeout);

	Map<String, Object> authGenerate(Long uid);
}
