package kr.friennguage.service;

import kr.friennguage.domain.Auth;
import kr.friennguage.domain.User;
import kr.friennguage.dto.FL0001;
import kr.friennguage.dto.FL0002;
import kr.friennguage.dto.FL0003;
import kr.friennguage.dto.FL0004;
import kr.friennguage.dto.FL0005;
import kr.friennguage.dto.FL0006;
import kr.friennguage.dto.FL0007;
import kr.friennguage.dto.FL0008;
import kr.friennguage.dto.FLResponse;
import kr.friennguage.dto.PS0001;
import kr.friennguage.dto.PS0002;
import kr.friennguage.repository.AttachRepository;
import kr.friennguage.repository.GroupRepository;
import kr.friennguage.repository.LanguageRepository;
import kr.friennguage.repository.LocationRepository;
import kr.friennguage.repository.UserNotificationRepository;
import kr.friennguage.repository.UserRepository;
import kr.friennguage.util.TokenUtils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppService {
	private UserRepository userRepository;
	private UserNotificationRepository userNotificationRepository;
	private GroupRepository groupRepository;
	private AttachRepository attachRepository;
	private LanguageRepository languageRepository;
	private LocationRepository locationRepository;

	@Autowired
	public AppService(UserRepository userRepository, UserNotificationRepository userNotificationRepository,
			GroupRepository groupRepository, AttachRepository attachRepository, LanguageRepository languageRepository,
			LocationRepository locationRepository) {
		super();
		this.userRepository = userRepository;
		this.userNotificationRepository = userNotificationRepository;
		this.groupRepository = groupRepository;
		this.attachRepository = attachRepository;
		this.languageRepository = languageRepository;
		this.locationRepository = locationRepository;
	}

	// 로그인 or 회원가입
	public FLResponse<FL0001> fl0001Service(FL0001 fl) {
		FLResponse<FL0001> response = new FLResponse<FL0001>();

		String uid = fl.email + fl.password;
		User user = userRepository.findByUid(uid);
		String token = null;

		if (user == null) {
			user = new User();
			user.authId = Auth.Code.USER.ordinal();
			user.uid = uid;
			user = userRepository.save(user);
		}

		user.setPassword(uid);
		token = TokenUtils.createToken(user);

		fl.token = token;
		fl.userId = user.getUserId();

		return response;
	}

	//
	public FLResponse<FL0002> fl0002Service(FL0002 fl) {
		FLResponse<FL0002> response = new FLResponse<FL0002>();

		long userId = TokenUtils.getUserIdFromToken(fl.token);
		User user = userRepository.findOne(userId);

		fl.name = user.getName();
		fl.sex = user.getSex();
		fl.age = user.getAge();
		fl.job = user.getJob();
		fl.imgUrl = attachRepository.findOne(user.getProfileImg()).getUrl();
		fl.myLangId = user.getLanguageId();
		fl.favorLangId = user.getFavorLanguageId();
		fl.locationId = user.getLanguageId();
		fl.intro = user.content;
		
		response.tranData = fl;
		return response;
	}

	public FLResponse<FL0003> fl0003Service(FL0003 fl) {
		FLResponse<FL0003> response = new FLResponse<FL0003>();
		return response;
	}

	public FLResponse<FL0004> fl0004Service(FL0004 fl) {
		FLResponse<FL0004> response = new FLResponse<FL0004>();
		return response;
	}

	public FLResponse<FL0005> fl0005Service(FL0005 fl) {
		FLResponse<FL0005> response = new FLResponse<FL0005>();
		return response;
	}

	public FLResponse<FL0006> fl0006Service(FL0006 fl) {
		FLResponse<FL0006> response = new FLResponse<FL0006>();
		return response;
	}

	public FLResponse<FL0007> fl0007Service(FL0007 fl) {
		FLResponse<FL0007> response = new FLResponse<FL0007>();
		return response;
	}

	public FLResponse<FL0008> fl0008Service(FL0008 fl) {
		FLResponse<FL0008> response = new FLResponse<FL0008>();
		return response;
	}

	public FLResponse<PS0001> ps0001Service(PS0001 ps) {
		FLResponse<PS0001> response = new FLResponse<PS0001>();
		return response;
	}

	public FLResponse<PS0002> ps0002Service(PS0002 ps) {
		FLResponse<PS0001> response = new FLResponse<PS0001>();
		return response;
	}

}
