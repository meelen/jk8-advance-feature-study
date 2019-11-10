package com.meelen.lib.stream;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class StreamTest {

	@Test
	public void countLongWords() throws IOException {
		String contents = new String(
				Files.readAllBytes(Paths.get("D:\\code\\git\\01.my-projects\\jk8-advance-feature-study\\doc\\corejava\\gutenberg\\alice30.txt")), 
				StandardCharsets.UTF_8);
		// \\PL 非字母
		List<String> words = Arrays.asList(contents.split("\\PL"));
		// 计算长度大于12的单词总数
		long count = words.stream().filter(w -> w.length() > 12).count();
		System.out.println(count);

	}

}
