def call(int n)
{
  if(n%2 == 0)
  {
    pipeline
    {
      agent{
        label 'worker'
      }
      stages{
        stage('Even Stage')
        {
          steps{
            echo "This is even number build: #"+n
            script{
              log.info("INFO: This is even number build: #"+n)
              log.info("WARNING: This is even number build: #"+n)
            }
          }
        }
      }
    }
  }
}
