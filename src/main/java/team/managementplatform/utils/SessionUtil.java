package team.managementplatform.utils;

import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;

public class SessionUtil {

	public static String getCurrentOpenid(String code) {
		Map<String, Object> json=getSessionByCode(code);
		String openid=json.get("openid").toString();
		return openid;
	}

	@SuppressWarnings("unchecked")
	private static Map<String, Object> getSessionByCode(String code) {
		String url = null/*
							 * this.requestUrl + "?appid=" + appId + "&secret=" + appSecret + "&js_code=" +
							 * code + "&grant_type=" + grantType
							 */;
		// 发送请求
		String data = HttpUtil.get(url);
		ObjectMapper mapper = new ObjectMapper();
		Map<String, Object> json = null;
		try {
			json = mapper.readValue(data, Map.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// 形如{"session_key":"6w7Br3JsRQzBiGZwvlZAiA==","openid":"oQO565cXXXXXEvc4Q_YChUE8PqB60Y"}的字符串
		return json;
	}
}
