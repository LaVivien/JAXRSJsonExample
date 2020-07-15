package dto;

import java.util.*;



public class Response<T> {
	String date;
	List<String> params;
	String code;
	List<T> response;
}
