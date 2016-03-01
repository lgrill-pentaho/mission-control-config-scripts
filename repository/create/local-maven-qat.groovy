
repoName = userInput (
    type: "STRING",
    value : "public-maven-7.0-qat-local",
    description : "please provide a repository name"
  )
localRepository(repoName) {
  packageType "maven"
  handleSnapshots false
  handleReleases true
}
