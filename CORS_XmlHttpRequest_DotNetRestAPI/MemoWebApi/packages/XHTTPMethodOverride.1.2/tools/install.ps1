param($installPath, $toolsPath, $package, $project)

$path = [System.IO.Path]
$appstart = $path::Combine($path::GetDirectoryName($project.FileName), "App_Start\XHTTPMethodOverride.cs")
$DTE.ItemOperations.OpenFile($appstart)

