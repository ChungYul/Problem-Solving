package com.choong.problem.programmers.level2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("스킬트리 테스트")
class SkillTreeTest {

  @Test
  @DisplayName("스킬에서 모든 걸 선택한 경우")
  void testSolution_select_all_element_from_skill_set() {
    SkillTree skillTree = new SkillTree();
    
    assertEquals(2, skillTree.solution("CBD", new String[] {"BACDE", "CBADF", "AECB", "BDA"}));
  }
  
  @Test
  @DisplayName("스킬에서 모든 선택하지 않은 경우")
  void testSolution_not_select_all_element_from_skill_set() {
    SkillTree skillTree = new SkillTree();
    
    assertEquals(2, skillTree.betterSolution("CBD", new String[] {"CXF", "ASF", "BDF", "CEFD "}));
  }

}
