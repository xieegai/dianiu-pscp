package test.edianniu.mis.http;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.JSONObject;
import com.edianniu.pscp.mis.bean.request.user.ChangePwdRequest;
import com.edianniu.pscp.mis.bean.request.user.GetUserRequest;
import com.edianniu.pscp.mis.bean.request.user.UpdateUserRequest;
import com.edianniu.pscp.mis.bean.response.user.ChangePwdResponse;
import com.edianniu.pscp.mis.bean.response.user.GetUserResponse;
import com.edianniu.pscp.mis.bean.response.user.UpdateUserResponse;

public class UpdateUserPassword extends BaseHttp {
	private static final Logger log = LoggerFactory.getLogger(UpdateUserPassword.class);

	// private BeanMixedTLVDecoder tlvBeanDecoder;
	// private BeanMixedTLVEncoder tlvBeanEncoder;

	@Before
	public void setUp() throws Exception {
		/*
		 * AbstractApplicationContext root = new ClassPathXmlApplicationContext(
		 * "classpath*:stc/protocol/mixedCodec.xml"); tlvBeanDecoder =
		 * (BeanMixedTLVDecoder) root.getBean("tlvBeanDecoder"); tlvBeanEncoder
		 * = (BeanMixedTLVEncoder) root.getBean("tlvBeanEncoder");
		 */

	}

	@Test
	public void test() throws IOException {

		String uri = "http://" + ServerIP + ":" + Port + "/member/changepwd";
		ChangePwdRequest req = new ChangePwdRequest();
		req.setUid(1095L);
		req.setToken("85921728");
		req.setNewpwd("111111");
		req.setOldpwd("123456");
		
		String result = httpPost(uri, req);
		ChangePwdResponse resp = JSONObject
				.parseObject(result, ChangePwdResponse.class);
		log.info("resp=" + result);

	}

	@After
	public void tearDown() throws Exception {
		System.out.println("tearDown");
	}

	public static void main(String[] args) {

	}
}
