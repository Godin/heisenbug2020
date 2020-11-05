package org.example;

import org.jacoco.agent.rt.IAgent;
import org.jacoco.agent.rt.RT;
import org.junit.platform.engine.TestExecutionResult;
import org.junit.platform.launcher.TestExecutionListener;
import org.junit.platform.launcher.TestIdentifier;
import org.junit.platform.launcher.TestPlan;

public class CoverageTestExecutionListener implements TestExecutionListener {

  private final IAgent agent;

  public CoverageTestExecutionListener() {
    agent = RT.getAgent();
  }

  @Override
  public void testPlanExecutionStarted(TestPlan testPlan) {
    System.out.println("Test plan execution started");
    System.out.println("JaCoCo version " + agent.getVersion());
  }

  @Override
  public void executionStarted(TestIdentifier testIdentifier) {
    System.out.println("Test execution started: " + testIdentifier.getDisplayName());
  }

  /**
   * TODO should save execution data - see
   *  <a href="https://www.jacoco.org/jacoco/trunk/doc/api/org/jacoco/agent/rt/IAgent.html">IAgent</a>
   */
  @Override
  public void executionFinished(TestIdentifier testIdentifier, TestExecutionResult testExecutionResult) {
    System.out.println("Test execution finished: " + testIdentifier.getDisplayName());
  }

  /**
   * TODO should generate reports - see
   *  <a href="https://www.jacoco.org/jacoco/trunk/doc/api.html">examples</a>
   */
  @Override
  public void testPlanExecutionFinished(TestPlan testPlan) {
    System.out.println("Test plan execution finished");
  }

}
