package com.example.quiz.service;

import java.util.Optional;

import com.example.quiz.entity.Quiz;

/** Quizサービス処理:Service */
public interface QuizService {
	/** クイズ情報を全件取得 */
	Iterable<Quiz> selectAll();
	
	/** クイズ情報を、idをキーに１件取得 */
	Optional<Quiz> selectOneById(Integer id);
	
	/** クイズ情報をランダムで１件取得 */
	Optional<Quiz> selectOneRandomQuiz();
	
	/** クイズの正解／不正解を判定 */
	Boolean checkQuiz(Integer id, Boolean myAnswer);
	
	/** クイズを登録 */
	void insertQuiz(Quiz quiz);
	
	/** クイズを更新 */
	void updateQuiz(Quiz quiz);
	
	/** クイズを削除 */
	void deleteQuizById(Integer id);
}
